package board;

import unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {
    private List units;

    public Tile() {
        this.units = new LinkedList();
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }
}
