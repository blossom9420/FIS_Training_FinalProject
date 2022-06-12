package vn.fis.training.phl.memories;

import vn.fis.training.phl.memories.interfaces.ICriminalCase;
import vn.fis.training.phl.models.CriminalCase;

import java.util.List;
import java.util.Optional;

import static vn.fis.training.phl.memories.MemoryDataSource.CRIMINAL_CASES;

public class CriminalCaseDAO implements ICriminalCase {
    @Override
    public void save(CriminalCase criminalCase) {
        MemoryDataSource.CRIMINAL_CASES.add(criminalCase);
    }

    @Override
    public Optional<CriminalCase> get(long id) {
        return MemoryDataSource.CRIMINAL_CASES.stream()
                .filter(criminalCase -> criminalCase.getId() == id)
                .findFirst();
    }

    @Override
    public List<CriminalCase> getAll() {
        return CRIMINAL_CASES;
    }

    @Override
    public void update(CriminalCase updateCriminalCase) {
        MemoryDataSource.CRIMINAL_CASES.stream()
                .filter(criminalCase -> criminalCase.getId() == criminalCase.getId())
                .forEach(c -> c.replace(updateCriminalCase));
    }

    @Override
    public void delete(CriminalCase criminalCase) {
        MemoryDataSource.CRIMINAL_CASES.remove(criminalCase);
    }
}
























