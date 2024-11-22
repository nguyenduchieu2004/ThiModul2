package Service;

import Model.DanhBa;
import Repository.DanhbaRepo;
import Repository.IDanhbaRepo;

import java.util.List;

public class DanhbaService implements IDanhbaService {
    private final IDanhbaRepo iDanhbaRepo = new DanhbaRepo();
    @Override
    public List<DanhBa> findAll() {
        return iDanhbaRepo.findAll();
    }

    @Override
    public void save(DanhBa danhBa) {
    iDanhbaRepo.save(danhBa);
    }

    @Override
    public DanhBa findByNhomdanhba(int Nhomdanhba) {
        return iDanhbaRepo.findByNhomdanhba(Nhomdanhba);
    }

    @Override
    public void update(DanhBa danhBa) {
    iDanhbaRepo.update(danhBa);
    }

    @Override
    public void delete(int Nhomdanhba) {
    iDanhbaRepo.delete(Nhomdanhba);
    }

    @Override
    public void search(int Nhomdanhba) {

    }
}
