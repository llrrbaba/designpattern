package cn.rocker.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rocker
 * @date 2019/09/21 15:19
 * @since V1.0
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        commandList.stream().forEach(command -> command.execute());
        commandList.clear();
    }

}
