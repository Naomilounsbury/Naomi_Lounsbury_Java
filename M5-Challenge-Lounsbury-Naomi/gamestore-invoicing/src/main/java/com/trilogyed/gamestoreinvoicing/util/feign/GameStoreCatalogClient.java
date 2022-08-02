package com.trilogyed.gamestoreinvoicing.util.feign;

import com.trilogyed.gamestoreinvoicing.model.Console;
import com.trilogyed.gamestoreinvoicing.model.Game;
import com.trilogyed.gamestoreinvoicing.model.TShirt;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Optional;


@FeignClient(name ="game-store-catalog")
public interface GameStoreCatalogClient {

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public Game getGameInfo(@PathVariable ("id") long id);


    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
    public Console getConsoleInfo(@PathVariable long id);

    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.GET)
    public TShirt getTshirtInfo(@PathVariable long id);
    @RequestMapping(value = "/tshirt", method = RequestMethod.POST)
    public TShirt createTShirt(@RequestBody TShirt tShirt);

//    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.PUT)
//    public TShirt updateTshirt(@RequestBody TShirt tshirt);

}
