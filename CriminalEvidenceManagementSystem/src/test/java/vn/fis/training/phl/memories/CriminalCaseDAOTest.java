package vn.fis.training.phl.memories;

import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.fis.training.phl.memories.interfaces.ICriminalCase;
import vn.fis.training.phl.models.CriminalCase;

import static org.junit.jupiter.api.Assertions.*;


class CriminalCaseDAOTest {
   // Logger LOG = LoggerFactory.getLogger(CriminalCaseDAOTest.class); ko dùng annotaion thì phải khai báo cái này
     CriminalCaseDAO criminalCaseDAO = new CriminalCaseDAO();
    @Test
    void save(){
     CriminalCase c1 = new CriminalCase();
     c1.setId(1L);     c1.setShortDescription("short-c1");
     CriminalCase c2 = new CriminalCase();
     c2.setId(2L);     c2.setShortDescription("short-c2");

     MemoryDataSource.CRIMINAL_CASES.add(c1);
     MemoryDataSource.CRIMINAL_CASES.add(c2);

     CriminalCase c3 = new CriminalCase();
     c3.setId(3L);     c3.setShortDescription("short-c3");
     criminalCaseDAO.save(c3);
     //System.out.println(MemoryDataSource.CRIMINAL_CASES);
     assertEquals(3,MemoryDataSource.CRIMINAL_CASES.size());

    }

    @Test
    void get(){
     CriminalCase c1 = new CriminalCase();
     c1.setId(1L);     c1.setShortDescription("short-c1");
     CriminalCase c2 = new CriminalCase();
     c2.setId(2L);     c2.setShortDescription("short-c2");
     CriminalCase c3 = new CriminalCase();
     c3.setId(3L);     c3.setShortDescription("short-c3");

     MemoryDataSource.CRIMINAL_CASES.add(c1);
     MemoryDataSource.CRIMINAL_CASES.add(c2);
     MemoryDataSource.CRIMINAL_CASES.add(c3);

     assertEquals(c1,criminalCaseDAO.get(1L).get());
    }

    @Test
    void getAll(){
     CriminalCase c1 = new CriminalCase();
     c1.setId(1L);     c1.setShortDescription("short-c1");
     CriminalCase c2 = new CriminalCase();
     c2.setId(2L);     c2.setShortDescription("short-c2");
     CriminalCase c3 = new CriminalCase();
     c3.setId(3L);     c3.setShortDescription("short-c3");

     MemoryDataSource.CRIMINAL_CASES.add(c1);
     MemoryDataSource.CRIMINAL_CASES.add(c2);
     MemoryDataSource.CRIMINAL_CASES.add(c3);

     assertEquals(3,criminalCaseDAO.getAll().size());
    }

    @Test
    void update(){
     CriminalCase c1 = new CriminalCase();
     c1.setId(1L);     c1.setShortDescription("short-c1");
     CriminalCase c2 = new CriminalCase();
     c2.setId(2L);     c2.setShortDescription("short-c2");

     MemoryDataSource.CRIMINAL_CASES.add(c1);
     MemoryDataSource.CRIMINAL_CASES.add(c2);

     CriminalCase c3 = new CriminalCase();
     c3.setId(1L);     c3.setShortDescription("short-has changed: c3");
     criminalCaseDAO.update(c3);

     assertEquals("short-has changed: c3",criminalCaseDAO.get(1L).get().getShortDescription() );
    }

    @Test
    void delete(){
     CriminalCase c1 = new CriminalCase();
     c1.setId(1L);     c1.setShortDescription("short-c1");
     CriminalCase c2 = new CriminalCase();
     c2.setId(2L);     c2.setShortDescription("short-c2");
     CriminalCase c3 = new CriminalCase();
     c3.setId(3L);     c3.setShortDescription("short-c3");

     criminalCaseDAO.save(c1);
     criminalCaseDAO.save(c2);
     criminalCaseDAO.save(c3);

     criminalCaseDAO.delete(c2);
     assertEquals(2,criminalCaseDAO.getAll().size());
    }
}