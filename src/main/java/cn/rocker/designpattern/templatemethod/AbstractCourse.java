package cn.rocker.designpattern.templatemethod;

/**
 * @author rocker
 * @date 2019/09/01 22:34
 * @since V1.0
 */
public abstract class AbstractCourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needMakeArticle()){
            this.makeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void makeArticle(){
        System.out.println("制作手记");
    }
    protected boolean needMakeArticle(){
        return false;
    }
    abstract void packageCourse();
}
