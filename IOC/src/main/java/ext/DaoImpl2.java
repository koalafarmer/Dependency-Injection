package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 2");
        double temp=88;
        return temp;
    }
}
