@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    
    @Autowired
    private ProfileService profileService;

    @GetMapping("/{userId}")
    public ProfileDTO getProfile(@PathVariable Long userId) {
        return profileService.getProfile(userId);
    }

    @PutMapping("/{userId}")
    public void updateProfile(@PathVariable Long userId, @RequestBody ProfileDTO profileDTO) {
        profileService.updateProfile(userId, profileDTO);
    }

    @PostMapping("/{userId}/picture")
    public void uploadPicture(@PathVariable Long userId, @RequestParam("file") MultipartFile file) {
        profileService.uploadPicture(userId, file);
    }
}

<!-- Login Page -->
<div class="container">
    <form>
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>

<!-- Profile Page -->
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <img src="profile-picture.jpg" class="img-fluid">
            <form>
                <!-- Edit Profile Form -->
            </form>
            <button class="btn btn-danger">Logout</button>
        </div>
    </div>
</div>
