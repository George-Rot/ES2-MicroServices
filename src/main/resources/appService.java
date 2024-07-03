import java.util.List;
import java.util.Optional;

@Service
public class appService {

    @Autowired
    private AppRepository appRepository;

    public App addApp(App app) {
        return appRepository.save(app);
    }

    public void removeApp(Long id) {
        appRepository.deleteById(id);
    }

    public Optional<App> getApp(Long id) {
        return appRepository.findById(id);
    }

    public List<App> listApps() {
        return appRepository.findAll();
    }
}