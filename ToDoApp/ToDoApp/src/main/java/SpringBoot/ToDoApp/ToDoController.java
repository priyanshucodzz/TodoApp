package SpringBoot.ToDoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @PostMapping("/add-task")
    public String addTask(@RequestParam("task") String task) {
        ToDoItem item = new ToDoItem();
        item.setTask(task);
        toDoRepository.save(item);
        return "redirect:/";
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }
}

