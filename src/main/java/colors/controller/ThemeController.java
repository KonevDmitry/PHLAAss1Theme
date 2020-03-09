package colors.controller;

import colors.model.Theme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class ThemeController {

    @RequestMapping(value = "/theme/colors", method = RequestMethod.GET)
    public ModelAndView time() {
        ModelAndView model = new ModelAndView();
        model.addObject("themeColors", getTheme());
        model.setViewName("colors");
        return model;
    }

    private Theme getTheme() {
        return new Theme(generateColor(), generateColor());
    }

    private String generateColor() {
        Random obj = new Random();
        int rand_num = obj.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", rand_num);
        return colorCode;
    }
}