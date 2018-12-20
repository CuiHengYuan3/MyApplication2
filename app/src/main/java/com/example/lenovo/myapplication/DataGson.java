package com.example.lenovo.myapplication;

import java.util.List;

public class DataGson {
    /**
     * date : 20181216
     * stories : [{"images":["https://pic4.zhimg.com/v2-105689dc28231e59289d28e3eb882abb.jpg"],"type":0,"id":9703821,"ga_prefix":"121619","title":"汽车上隐藏了哪些我们很难发现，但是却精妙无比的设计？"},{"title":"徒步这条线，要么成为骨灰级玩家，要么成为骨灰","ga_prefix":"121618","images":["https://pic3.zhimg.com/v2-98cdf5a7ca27ed065fc28a5e3d34ef82.jpg"],"multipic":true,"type":0,"id":9665015},{"title":"在免签天堂摩洛哥，我差点成了羊羔的爹","ga_prefix":"121616","images":["https://pic1.zhimg.com/v2-20fdc82d3194ae3f5bd7d927380ab820.jpg"],"multipic":true,"type":0,"id":9634448},{"images":["https://pic3.zhimg.com/v2-0834d667ce685ea2784ef57252d9628e.jpg"],"type":0,"id":9703656,"ga_prefix":"121613","title":"月亮为什么这么大？一个简单的问题，科学家至今没搞明白"},{"images":["https://pic4.zhimg.com/v2-a4c121fc7af13ade35d1c06562d6d17b.jpg"],"type":0,"id":9703862,"ga_prefix":"121612","title":"大误 · 眼前的红薯不是薯，你说的白是什么白？"},{"images":["https://pic4.zhimg.com/v2-f47b3a042af91d007c5a03ab46849dcf.jpg"],"type":0,"id":9663987,"ga_prefix":"121610","title":"为什么日本的菜板看起来比我们的更轻更薄？"},{"images":["https://pic1.zhimg.com/v2-7aaa8adacb76d91c2506a02b75f5eae0.jpg"],"type":0,"id":9703427,"ga_prefix":"121608","title":"最近睡得不太好吧？"},{"images":["https://pic4.zhimg.com/v2-e591fd5899728018ce760ca7a808449f.jpg"],"type":0,"id":9703822,"ga_prefix":"121607","title":"该给你的另一半看手机吗？佟大为：我全都给"},{"images":["https://pic3.zhimg.com/v2-d30aa4ebb60eea292e2edb7bdee1b9ce.jpg"],"type":0,"id":9703800,"ga_prefix":"121607","title":"在全球 5G 市场中，华为到底扮演了怎样的角色？"},{"images":["https://pic3.zhimg.com/v2-f1fbb3de2aaf9b75e21a10bb4990b44e.jpg"],"type":0,"id":9703788,"ga_prefix":"121606","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-e557c2ce21dc634e8a2db11a0d5d0a4d.jpg","type":0,"id":9634448,"ga_prefix":"121616","title":"在免签天堂摩洛哥，我差点成了羊羔的爹"},{"image":"https://pic3.zhimg.com/v2-9f89d22c66bf90dd96b8fa0f893b226e.jpg","type":0,"id":9703800,"ga_prefix":"121607","title":"在全球 5G 市场中，华为到底扮演了怎样的角色？"},{"image":"https://pic4.zhimg.com/v2-96685f9e339e9172706a7039b0c797af.jpg","type":0,"id":9703745,"ga_prefix":"121521","title":"在《地球最后的夜晚》，做一场荡麦的梦"},{"image":"https://pic1.zhimg.com/v2-e2ff95e1e02a836a3ac3754a981605cc.jpg","type":0,"id":9703486,"ga_prefix":"121510","title":"想拍出好照片，首先要把自己「献祭」了"},{"image":"https://pic4.zhimg.com/v2-a921210708f70176ba03b4c047cb42eb.jpg","type":0,"id":9703746,"ga_prefix":"121508","title":"中国父母在教育上普遍存在哪些问题？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-105689dc28231e59289d28e3eb882abb.jpg"]
         * type : 0
         * id : 9703821
         * ga_prefix : 121619
         * title : 汽车上隐藏了哪些我们很难发现，但是却精妙无比的设计？
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic2.zhimg.com/v2-e557c2ce21dc634e8a2db11a0d5d0a4d.jpg
         * type : 0
         * id : 9634448
         * ga_prefix : 121616
         * title : 在免签天堂摩洛哥，我差点成了羊羔的爹
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
