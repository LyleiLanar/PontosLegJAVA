package main.adventOfCode.ms3;

import main.adventOfCode.ms3.Exceptions.InvalidSpiralMemoryException;

public class SpiralMemory {

     /*
        325489

        0   1   2   3   4

    0   17  16  15  14  13
    1   18   5   4   3  12
    2   19   6   1   2  11
    3   20   7   8   9  10
    4   21  22  23  24  25


        j, f, b, l

        j,
        f,
        b, b,
        l, l,
        j, j, j,
        f, f, f,
        b, b, b, b,
        l, l, l, l,
        j, j, j, j, j
        f, f, f, f, f



        n = 3 -> data[1][1]
        n = 5 -> data[2][2]
        n = 7 -> data[3][3]
        n = 9 -> data[4][4]
        n -> data[n/2][n/2]

     */

    private enum Direction {
        RIGHT, UP, LEFT, DOWN
    }

    public int[][] data;
    public Koord pointer;

    public Koord getCenter() {
        return new Koord(data.length / 2, data.length / 2);
    }

    public SpiralMemory(int a) throws Exception {
        if (a % 2 == 0) {
            throw new InvalidSpiralMemoryException("Nem megfelelő mátrix!");
        }

        this.data = new int[a][a];
        this.pointer = new Koord(data.length / 2, data.length / 2);

    }

    public int getNeighboursSum() {
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        //jobb
        try {
            sum += data[pointer.getY()][pointer.getX() + 1];
            sb.append(data[pointer.getY()][pointer.getX() + 1] + " ");
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Nincs ilyen elem.");
        }

        //jobbfent
        try {
            sum += data[pointer.getY() - 1][pointer.getX() + 1];
            sb.append(data[pointer.getY() - 1][pointer.getX() + 1] + " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        //fent
        try {
            sum += data[pointer.getY() - 1][pointer.getX()];
            sb.append(data[pointer.getY() - 1][pointer.getX()]+ " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        //balrafent
        try {
            sum += data[pointer.getY() - 1][pointer.getX() - 1];
            sb.append(data[pointer.getY() - 1][pointer.getX() - 1] + " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        //balra
        try {
            sum += data[pointer.getY()][pointer.getX() - 1];
            sb.append(data[pointer.getY()][pointer.getX() - 1] + " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        //balralent
        try {
            sum += data[pointer.getY() + 1][pointer.getX() - 1];
            sb.append(data[pointer.getY() + 1][pointer.getX() - 1] + " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        //lent
        try {
            sum += data[pointer.getY() + 1][pointer.getX()];
            sb.append(data[pointer.getY() + 1][pointer.getX()] + " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        //jobblent
        try {
            sum += data[pointer.getY() + 1][pointer.getX() + 1];
            sb.append(data[pointer.getY() + 1][pointer.getX() + 1] + " ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nincs ilyen elem.");
        }

        System.out.println(sb.toString() + " = " + sum);

        return sum;

    }

    public void setDataSum() throws Exception {

        Direction actDirection = Direction.RIGHT;
        int ismetles = 1;
        pointer = getCenter();

        setDataCell(1);
        int actNumber = 2;
        int a = data.length;

        boolean vege = false;

        while (true) {

            for (int i = 0; i < ismetles; i++) {
                step(actDirection);

                //hogy kell kiszámolni.
                setDataCell(getNeighboursSum());
                if (actNumber >= a * a) {
                    vege = true;
                    break;
                }
                actNumber++;
            }

            if (vege) {
                break;
            }

            actDirection = nextDir(actDirection);

            for (int i = 0; i < ismetles; i++) {
                step(actDirection);
                setDataCell(getNeighboursSum());
                if (actNumber >= a * a) {
                    vege = true;
                    break;
                }
                actNumber++;
            }

            if (vege) {
                break;
            }

            actDirection = nextDir(actDirection);
            ismetles++;
        }
    }

    private void setDataCell(int value) {
        data[pointer.getX()][pointer.getY()] = value;
    }


    public void setDataDefault() throws Exception {

        Direction actDirection = Direction.RIGHT;
        int ismetles = 1;

        pointer = getCenter();
        data[pointer.getX()][pointer.getY()] = 1;
        int actNumber = 2;
        int a = data.length;

        boolean vege = false;

        while (true) {


            for (int i = 0; i < ismetles; i++) {
                step(actDirection);
                data[pointer.getX()][pointer.getY()] = actNumber;
                if (actNumber >= a * a) {
                    vege = true;
                    break;
                }
                actNumber++;
            }

            if (vege) {
                break;
            }

            actDirection = nextDir(actDirection);

            for (int i = 0; i < ismetles; i++) {
                step(actDirection);
                data[pointer.getX()][pointer.getY()] = actNumber;
                if (actNumber >= a * a) {
                    vege = true;
                    break;
                }
                actNumber++;
            }

            if (vege) {
                break;
            }

            actDirection = nextDir(actDirection);
            ismetles++;
        }
    }

    public int getDistanceById(int id) {

        Koord idK = getKoordById(id);
        Koord centerK = getCenter();

        return Math.abs((idK.getX() - centerK.getX())) + Math.abs((idK.getY() - centerK.getY()));

    }

    public Koord getKoordById(int id) {

        if (id >= 1 && id <= (data.length * data.length)) {

            Koord koord;

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {

                    if (data[i][j] == id) {
                        return new Koord(j, i);
                    }

                }
            }
        }
        return null;

    }

    public void printMemory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                System.out.printf("%-7s", data[i][j]);

            }
            System.out.println();
        }
    }

    public Direction nextDir(Direction dir) throws Exception {
        switch (dir) {
            case UP:
                return Direction.LEFT;
            case DOWN:
                return Direction.RIGHT;
            case LEFT:
                return Direction.DOWN;
            case RIGHT:
                return Direction.UP;
            default:
                throw new Exception("Kicsimaci!");
        }

    }

    public void step(Direction dir) {
        switch (dir) {
            case UP:
                stepUp();
                break;
            case DOWN:
                stepDown();
                break;
            case LEFT:
                stepLeft();
                break;
            case RIGHT:
                stepRight();
                break;
        }
    }

    public void stepRight() {

        if (pointer.getY() < data.length - 1) {
            pointer.setY(pointer.getY() + 1);
        }
    }

    public void stepUp() {

        if (pointer.getX() > 0) {
            pointer.setX(pointer.getX() - 1);
        }
    }

    public void stepLeft() {

        if (pointer.getY() > 0) {
            pointer.setY(pointer.getY() - 1);
        }

    }

    public void stepDown() {
        if (pointer.getX() < data.length - 1) {
            pointer.setX(pointer.getX() + 1);
        }
    }

}
