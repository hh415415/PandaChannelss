package com.example.administrator.pandachannels.fragmenthome.Bean;

import java.util.List;

/**
 * Created by lenovo on 2017/9/15.
 */
//阿萨德阿萨德按时
public class HomeRolling {

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * daytime : 2017-09-08
         * id : TITE1504961938528262
         * image : http://p1.img.cctvpic.com/photoworkspace/2017/09/08/2017090815251797202.jpg
         * order : 1
         * pid : b258dc46dd0044f9a66ab99345412822
         * title : 《当熊不让》新生代网红实力登场
         * type : 2
         * url : http://live.ipanda.com/2017/09/08/VIDEWiuScgP4dNo9DQTLUpdd170908.shtml
         * vid :
         * videoLength : 01:59
         */

        private String daytime;
        private String id;
        private String image;
        private String order;
        private String pid;
        private String title;
        private String type;
        private String url;
        private String vid;
        private String videoLength;

        public String getDaytime() {
            return daytime;
        }

        public void setDaytime(String daytime) {
            this.daytime = daytime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public String getVideoLength() {
            return videoLength;
        }

        public void setVideoLength(String videoLength) {
            this.videoLength = videoLength;
        }
    }
}
