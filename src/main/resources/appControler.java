import java.util.List;
import java.util.Optional;

public class appControler {
@RestController
@RequestMapping("/api/apps")

public class AppController {

    @Autowired
    private AppService appService;

    @PostMapping
    public ResponseEntity<App> createApp(@RequestBody App app) {
        App createdApp = appService.addApp(app);
        return ResponseEntity.ok(createdApp);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApp(@PathVariable Long id) {
        appService.removeApp(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<App> getApp(@PathVariable Long id) {
        Optional<App> app = appService.getApp(id);
        return app.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<App>> listApps() {
        List<App> apps = appService.listApps();
        return ResponseEntity.ok(apps);
    }
}
}
