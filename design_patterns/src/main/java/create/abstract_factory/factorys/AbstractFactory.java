package create.abstract_factory.factorys;

import create.factory.interfaces.Cpu;
import create.factory.interfaces.Mainboard;

/**
 * @Author: lxy
 * @Date: 2019/6/10 16:56
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
