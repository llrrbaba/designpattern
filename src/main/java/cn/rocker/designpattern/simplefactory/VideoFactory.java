package cn.rocker.designpattern.simplefactory;

/**
 * @author rocker
 * @date 2019/09/01 12:27
 * @since V1.0
 */
public class VideoFactory {

    /**
     * 河段代码其实也不太符合开闭原则，
     * 因为如果新增{@link Video}实现类的话，这里还是要做修改
     *
     * @param type
     * @return
     * @version v1
     */
    public Video getVideoByType(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }


    /**
     * 根据反射获取实现类，
     * 相对于上面那个方法，要好点，
     * 即使我新增{@link Video}实现类，
     * 这个工厂方法也不用改，
     * 只要调用时传入对应的Class即可
     *
     * @param clazz
     * @return
     * @version v1
     */
    public Video getVideoByReflect(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
