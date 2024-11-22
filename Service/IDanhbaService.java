package Service;

import Model.DanhBa;

import java.util.List;

public interface IDanhbaService {
    List<DanhBa> findAll();
    void save (DanhBa danhBa);
    DanhBa findByNhomdanhba(int Nhomdanhba);
    void update(DanhBa danhBa);
    void delete(int Nhomdanhba);
    void search(int Nhomdanhba);
}
