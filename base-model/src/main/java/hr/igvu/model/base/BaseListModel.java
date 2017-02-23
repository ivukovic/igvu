package hr.igvu.model.base;

import java.util.ArrayList;
import java.util.List;

public class BaseListModel<T> extends BaseModel<T> {

    protected List<T> rows;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public void add(T t) {
        if (rows == null) {
            rows = new ArrayList<>();
        }
        rows.add(t);
    }

    public void addAll(List<T> tList) {
        if (rows == null) {
            rows = new ArrayList<>();
        }
        rows.addAll(tList);
    }
}
