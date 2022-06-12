package vn.fis.training.phl.memories;

import vn.fis.training.phl.memories.interfaces.IEvidence;
import vn.fis.training.phl.models.Evidence;

import java.util.List;
import java.util.Optional;

public class EvidenceDAO implements IEvidence {
    @Override
    public void save(Evidence evidence) {
        MemoryDataSource.EVIDENCES.add(evidence);
    }

    @Override
    public Optional<Evidence> get(long id) {
        return MemoryDataSource.EVIDENCES.stream()
                .filter(evidence -> evidence.getId() == id)
                .findFirst();
    }

    @Override
    public List<Evidence> getAll() {
        return MemoryDataSource.EVIDENCES;
    }

    @Override
    public void update(Evidence updateEvidence) {
        MemoryDataSource.EVIDENCES.stream()
                .filter(evidence -> evidence.getId() == evidence.getId())
                .forEach(c -> c.replace(updateEvidence));
    }

    @Override
    public void delete(Evidence evidence) {
        MemoryDataSource.EVIDENCES.remove(evidence);
    }
}
