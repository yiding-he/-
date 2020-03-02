package 我的计算器.基础封装;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class 窗口封装 {

    private Stage 主窗口;

    public 窗口封装(Stage 主窗口) {
        this.主窗口 = 主窗口;
    }

    public 窗口封装 设置标题(String 标题) {
        this.主窗口.setTitle(标题);
        return this;
    }

    public 窗口封装 加载界面文件(String 界面文件路径) {
        try {
            主窗口.setScene(new Scene(
                FXMLLoader.load(界面框架.class.getResource(界面文件路径))
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public 窗口封装 打开() {
        主窗口.show();
        return this;
    }
}
