package Apps.md.ap1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/info")
public class APP {
  private final Repo repo;

  public APP(Repo repo) {
    this.repo = repo;
  }


  @GetMapping
  public ResponseEntity<List<Repo>>info() {
    List<Repo> s = new ArrayList<>();
    Repo k = new Repo();
    s.add(k );
   return ResponseEntity.ok(s);
  }
}
