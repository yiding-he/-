package 我的计算器;

import 我的计算器.基础封装.界面框架;

public class 我的计算器主类 {

    public static void main(String[] args) {
        界面框架
            .获得主窗口(主窗口 -> 主窗口
                .设置标题("我的计算器")
                .加载界面文件("/主界面.fxml")
                .打开()
            );
    }
}
