package vn.fis.training.phl.memories;

import org.junit.jupiter.api.Test;
import vn.fis.training.phl.models.Detective;
import vn.fis.training.phl.models.Evidence;

import static org.junit.jupiter.api.Assertions.*;

class EvidenceDAOTest {
    EvidenceDAO evidenceDAO = new EvidenceDAO();
    @Test
    void save() {
        Evidence e1 = new Evidence();
        e1.setId(1L);     e1.setNotes("note-e1");
        Evidence e2 = new Evidence();
        e2.setId(2L);     e2.setNotes("note-e2");
        MemoryDataSource.EVIDENCES.add(e1);
        MemoryDataSource.EVIDENCES.add(e2);

        Evidence e3 = new Evidence();
        e3.setId(3L);     e3.setNotes("note-e3");
        evidenceDAO.save(e3);

        //System.out.println(MemoryDataSource.CRIMINAL_CASES);
        assertEquals(3,MemoryDataSource.EVIDENCES.size());
    }

    @Test
    void get() {
        Evidence e1 = new Evidence();
        e1.setId(1L);     e1.setNotes("note-e1");
        Evidence e2 = new Evidence();
        e2.setId(2L);     e2.setNotes("note-e2");
        Evidence e3 = new Evidence();
        e3.setId(3L);     e3.setNotes("note-e3");

        evidenceDAO.save(e1);
        evidenceDAO.save(e2);
        evidenceDAO.save(e3);

        //System.out.println(MemoryDataSource.CRIMINAL_CASES);
        assertEquals(e2,evidenceDAO.get(2L).get());
    }

    @Test
    void getAll() {
        Evidence e1 = new Evidence();
        e1.setId(1L);     e1.setNotes("note-e1");
        Evidence e2 = new Evidence();
        e2.setId(2L);     e2.setNotes("note-e2");
        Evidence e3 = new Evidence();
        e3.setId(3L);     e3.setNotes("note-e3");

        evidenceDAO.save(e1);
        evidenceDAO.save(e2);
        evidenceDAO.save(e3);

        //System.out.println(MemoryDataSource.CRIMINAL_CASES);
        assertEquals(3,evidenceDAO.getAll().size());
    }

    @Test
    void update() {
        Evidence e1 = new Evidence();
        e1.setId(1L);     e1.setNotes("note-e1");
        Evidence e2 = new Evidence();
        e2.setId(2L);     e2.setNotes("note-e2");
        Evidence e3 = new Evidence();
        e3.setId(3L);     e3.setNotes("note-e3");

        evidenceDAO.save(e1);
        evidenceDAO.save(e2);
        evidenceDAO.save(e3);

        Evidence e4 = new Evidence();
        e4.setId(2L);     e4.setNotes("update-note-e2");
        evidenceDAO.update(e4);
        assertEquals("update-note-e2",evidenceDAO.get(2L).get().getNotes());
    }

    @Test
    void delete() {
        Evidence e1 = new Evidence();
        e1.setId(1L);     e1.setNotes("note-e1");
        Evidence e2 = new Evidence();
        e2.setId(2L);     e2.setNotes("note-e2");
        Evidence e3 = new Evidence();
        e3.setId(3L);     e3.setNotes("note-e3");

        evidenceDAO.save(e1);
        evidenceDAO.save(e2);
        evidenceDAO.save(e3);

        evidenceDAO.delete(e2);
        assertEquals(2,evidenceDAO.getAll().size());
    }
}