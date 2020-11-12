package github.zero.miaosha.redis;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-11-22:55
 */
public abstract class BasePrefix implements KeyPrefix {

    private int expireSeconds;

    private String prefix;

    public BasePrefix(String prefix) {
        this(0,prefix);
    }

    public BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    @Override
    public int expireSeconds() {//默认0代表永不过期
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String classpath = getClass().getSimpleName();
        return classpath+":"+prefix;
    }
}
