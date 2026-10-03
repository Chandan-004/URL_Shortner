package factory;

import strategy.HashBasedStrategy;
import strategy.RandomBase62Strategy;
import strategy.ShortCodeGeneratorStrategy;

public class ShortCodeGeneratorFactory{
    public enum GeneratorType {
        RANDOM_BASE62,
        Hash
    }

    public static ShortCodeGeneratorStrategy getGenerator(GeneratorType type){
        switch (type){
            case Hash:
                return new HashBasedStrategy(); 
            case RANDOM_BASE62:
            default:
                return new RandomBase62Strategy();
        }
    }
}