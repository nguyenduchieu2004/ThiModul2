package Repository;

import IOStream.IODanhBa;
import Model.DanhBa;

import java.util.List;

public class DanhbaRepo implements IDanhbaRepo {
    @Override
    public List<DanhBa> findAll() {
        return IODanhBa.ConvertToListDanhBa();
    }

    @Override
    public void save(DanhBa danhBa) {
    IODanhBa.SaveDanhBaToFile(danhBa);
    }

    @Override
    public DanhBa findByNhomdanhba(int Nhomdanhba) {
        List<DanhBa> list = IODanhBa.ConvertToListDanhBa();
        for (DanhBa d : list) {
            if (d.getNhomcuadanhba() == Nhomdanhba) {
                return d;
            }
        }
        return null;
    }

    @Override
    public void update(DanhBa danhBa) {
        List<DanhBa> list = IODanhBa.ConvertToListDanhBa();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNhomcuadanhba() == danhBa.getNhomcuadanhba()) {
                list.set(i, danhBa);
                break;
            }
        }
        IODanhBa.saveToListDanhBa(list);
    }


    @Override
    public void delete(int Nhomdanhba) {
        List<DanhBa> list =IODanhBa.ConvertToListDanhBa();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNhomcuadanhba() == Nhomdanhba) {
                list.remove(i);
                break;
            }
        }
        IODanhBa.saveToListDanhBa(list);
    }

    @Override
    public void search(int Nhomdanhba) {
        List<DanhBa> list = IODanhBa.ConvertToListDanhBa();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNhomcuadanhba() == Nhomdanhba) {
                System.out.println(list.get(i));
            }
        }
        IODanhBa.saveToListDanhBa(list);

    }


}
