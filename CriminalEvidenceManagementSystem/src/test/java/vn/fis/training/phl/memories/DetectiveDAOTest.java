package vn.fis.training.phl.memories;

import org.junit.jupiter.api.Test;
import vn.fis.training.phl.models.CriminalCase;
import vn.fis.training.phl.models.Detective;

import static org.junit.jupiter.api.Assertions.*;

class DetectiveDAOTest {
    DetectiveDAO detectiveDAO = new DetectiveDAO();
    @Test
    void save() {
        Detective d1 = new Detective();
        d1.setId(1L);     d1.setUsername("username-d1");
        Detective d2 = new Detective();
        d2.setId(2L);     d2.setUsername("username-d2");

        MemoryDataSource.DETECTIVES.add(d1);
        MemoryDataSource.DETECTIVES.add(d2);

        Detective d3 = new Detective();
        d3.setId(3L);     d3.setUsername("username-d3");
        detectiveDAO.save(d3);
        //System.out.println(MemoryDataSource.CRIMINAL_CASES);
        assertEquals(3,MemoryDataSource.DETECTIVES.size());
    }

    @Test
    void get() {
        Detective d1 = new Detective();
        d1.setId(1L);     d1.setUsername("username-d1");
        Detective d2 = new Detective();
        d2.setId(2L);     d2.setUsername("username-d2");
        Detective d3 = new Detective();
        d3.setId(3L);     d3.setUsername("username-d3");

        detectiveDAO.save(d1);
        detectiveDAO.save(d2);
        detectiveDAO.save(d3);

        //System.out.println(MemoryDataSource.CRIMINAL_CASES);
        assertEquals(d2,detectiveDAO.get(2L).get());
    }

    @Test
    void getAll() {
        Detective d1 = new Detective();
        d1.setId(1L);     d1.setUsername("username-d1");
        Detective d2 = new Detective();
        d2.setId(2L);     d2.setUsername("username-d2");
        Detective d3 = new Detective();
        d3.setId(3L);     d3.setUsername("username-d3");

        detectiveDAO.save(d1);
        detectiveDAO.save(d2);
        detectiveDAO.save(d3);

        //System.out.println(MemoryDataSource.CRIMINAL_CASES);
        assertEquals(3,detectiveDAO.getAll().size());
    }

    @Test
    void update() {
        Detective d1 = new Detective();
        d1.setId(1L);     d1.setUsername("username-d1");
        Detective d2 = new Detective();
        d2.setId(2L);     d2.setUsername("username-d2");
        Detective d3 = new Detective();
        d3.setId(3L);     d3.setUsername("username-d3");

        detectiveDAO.save(d1);
        detectiveDAO.save(d2);
        detectiveDAO.save(d3);

        Detective updateDetective = new Detective();
        updateDetective.setId(2L);     updateDetective.setUsername("username-updateDetective");
        detectiveDAO.update(updateDetective);
        assertEquals("username-updateDetective",detectiveDAO.get(2L).get().getUsername());
    }

    @Test
    void delete() {
        Detective d1 = new Detective();
        d1.setId(1L);     d1.setUsername("username-d1");
        Detective d2 = new Detective();
        d2.setId(2L);     d2.setUsername("username-d2");
        Detective d3 = new Detective();
        d3.setId(3L);     d3.setUsername("username-d3");

        detectiveDAO.save(d1);
        detectiveDAO.save(d2);
        detectiveDAO.save(d3);

        detectiveDAO.delete(d2);
        assertEquals(2,detectiveDAO.getAll().size());
    }
}