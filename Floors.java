package latesgo;

import java.util.*;
import java.io.*;
import javafx.scene.paint.Paint;

/**
 *
 * @author Michael Capuano
 */
public class Floors {

    private int index;
    private ArrayList<Rooms> list = new ArrayList<Rooms>();
    private Rooms[][] nfloor = new Rooms[17][17];

    public Floors() {

        Rooms ra = new Rooms(1);
        list.add(ra);
        Rooms rb = new Rooms(2);
        list.add(rb);
        Rooms rc = new Rooms(2);
        list.add(rc);
        Rooms rd = new Rooms(3);
        list.add(rd);
        Rooms re = new Rooms(2);
        list.add(re);
        Rooms rf = new Rooms(2);
        list.add(rf);
        Rooms rg = new Rooms(3);
        list.add(rg);
        Rooms rh = new Rooms(2);
        list.add(rh);
        Rooms ri = new Rooms(3);
        list.add(ri);

        Random rand = new Random();
        int across, down, draw;
        across = nfloor.length / 2;
        down = nfloor[0].length / 2;

        nfloor[across][down] = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            do {
                draw = rand.nextInt(4) + 1;

                if (draw == 1) {

                    across -= 1;

                } else if (draw == 2) {

                    across += 1;

                } else if (draw == 3) {

                    down -= 1;

                } else if (draw == 4) {

                    down += 1;

                }

                if (draw == 1 && nfloor[across][down] != null) {

                    across += 1;

                } else if (draw == 2 && nfloor[across][down] != null) {

                    across -= 1;

                } else if (draw == 3 && nfloor[across][down] != null) {

                    down += 1;

                } else if (draw == 4 && nfloor[across][down] != null) {

                    down -= 1;

                }

            } while (nfloor[across][down] != null);

            nfloor[across][down] = list.get(i);
            System.out.println(across + ", " + down);
        }
    }

    public Floors(int index) {
        this.index = index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Rooms[][] getNfloor() {
        return nfloor;
    }

    public void setNfloor(Rooms[][] nfloor) {
        this.nfloor = nfloor;
    }

    public ArrayList<Rooms> getList() {
        return list;
    }

    public void setList(ArrayList<Rooms> list) {
        this.list = list;
    }
    

}
