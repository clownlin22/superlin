package create.build.client;


import create.build.builder.Builder;
import create.build.concretebuilder.ConcreteBuilder;
import create.build.director.Director;
import create.build.product.Product;

/**
 * @Author: lxy
 * @Date: 2019/6/13 16:23
 */
public class Client {
    public static void main(String[]args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
