package create.build.builder;

import create.build.product.Product;

/**
 * @Author: lxy
 * @Date: 2019/6/13 16:23
 */
public interface Builder {
    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();
}