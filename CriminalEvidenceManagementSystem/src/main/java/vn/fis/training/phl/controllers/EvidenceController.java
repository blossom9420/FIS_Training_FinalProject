package vn.fis.training.phl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.fis.training.phl.models.Detective;
import vn.fis.training.phl.models.Evidence;
import vn.fis.training.phl.services.DetectiveServiceImpl;
import vn.fis.training.phl.services.EvidenceServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/evidence")
public class EvidenceController {
    @Autowired
    private EvidenceServiceImpl evidenceService;

    // http://localhost:8080/evidence/getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<Evidence>> getAll() {
        List<Evidence> list = evidenceService.getAll();
        return new ResponseEntity<List<Evidence>>(list, HttpStatus.OK);
    }

    // http://localhost:8080/evidence/findById/2
    @GetMapping("/findById/{eviId}")
    public Evidence findById(@PathVariable(name = "eviId") Long eviId) {
        return evidenceService.findById(eviId);
    }

    // http://localhost:8080/evidence/createEvi
    @PostMapping("/createEvi")
    public Evidence createEvi(@RequestParam(name = "eviId") Long eviId, @RequestParam(name = "notes") String notes) {
        Evidence createEvi = new Evidence();
        createEvi.setId(eviId);
        createEvi.setNotes(notes);
        return evidenceService.create(createEvi);
    }

    // http://localhost:8080/evidence/updateEvi

    @PutMapping("/updateEvi")
    public Evidence updateEvi(@RequestParam(name = "eviId") Long eviId, @RequestParam(name = "updateNotes") String updateNotes) {
        Evidence updateEvi = new Evidence();
        updateEvi.setId(eviId);
        updateEvi.setNotes(updateNotes);
        return evidenceService.update(updateEvi);
    }

    // http://localhost:8080/evidence/deleteEvi
    @DeleteMapping("/deleteEvi")
    public Evidence deleteEvi(@RequestParam(name = "eviId") Long eviId) {
        return evidenceService.delete(eviId);
    }

}
