package 我的计算器.基础封装;

import java.util.function.Consumer;
import javafx.application.Application;
import javafx.stage.Stage;

public class 界面框架 extends Application {

    private static Stage 主窗口;

    private static Consumer<窗口封装> 窗口处理逻辑;

    public static void 获得主窗口(Consumer<窗口封装> 窗口处理逻辑) {
        界面框架.窗口处理逻辑 = 窗口处理逻辑;
        launch(界面框架.class);
    }

    @Override
    public void start(Stage 主窗口) throws Exception {
        界面框架.主窗口 = 主窗口;
        界面框架.窗口处理逻辑.accept(new 窗口封装(主窗口));
    }
}
