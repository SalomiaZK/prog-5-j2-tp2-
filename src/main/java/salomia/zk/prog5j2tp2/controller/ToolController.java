package salomia.zk.prog5j2tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableTools;
import salomia.zk.prog5j2tp2.entity.Renter;
import salomia.zk.prog5j2tp2.service.ToolsRenting;

import java.util.ArrayList;

@Controller
public class ToolController {

  ToolsRenting toolsRenting;

    public ToolController(ToolsRenting toolsRenting) {
        this.toolsRenting = toolsRenting;
    }

    @PostMapping("/rent/tools")
    public Rent rentTools(@RequestBody ArrayList<RentableTools> rentable, Renter renter) {
       return toolsRenting.rent(rentable, renter);
    }
}
