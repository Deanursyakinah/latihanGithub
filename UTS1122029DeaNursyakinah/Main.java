package UTS1122029DeaNursyakinah;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Main {
    public static void dataDummy(ArrayList<User> listUser, ArrayList<Post> listPost) {
        ArrayList<Comment> listComments = new ArrayList<Comment>();
        Comment komen1 = new Comment("01", "waa cantik banget", ContentState.PINNED);
        listComments.add(komen1);
        Comment komen2 = new Comment("02", "ih iyaa geulis pisaan", ContentState.SHOWED);
        listComments.add(komen2);

        Post reel = new Reel("111", ContentState.SHOWED, ContentType.VIDEO, Timestamp.valueOf("2018-09-01 09:01:15"), listComments, 01, 10);
        listPost.add(reel);

        Post feed = new Feed("222", ContentState.ARCHIVED, ContentType.PICTURE, Timestamp.valueOf("2020-09-01 09:01:15"), listComments, "beautiful day", 100);
        listPost.add(feed);

        Post story = new Story("333", ContentState.DELETED, ContentType.VIDEO, Timestamp.valueOf("2021-09-01 09:01:15"), listComments, 01, 1);
        listPost.add(story);

        User user1 = new User("001", "katarinabluu", "karinacantik123", "KARINA FROM AESPA", listPost);
        listUser.add(user1);

        User user2 = new User("002", "akusiapaa", "orang123", "aku siapa? kamu siapa?", listPost);
        listUser.add(user2);
    }

    public static void showUserPosts() {
        ArrayList<User> listUser = new ArrayList<User>();
        ArrayList<Post> listPost = new ArrayList<Post>();
        dataDummy(listUser, listPost);

        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            for (int j = 0; j < user.post.size(); j++) {
                Post postingan = listPost.get(j);
                if (postingan.getContentState() == ContentState.PINNED && postingan.getContentState() == ContentState.SHOWED) {
                    if (postingan instanceof Reel) {
                        Reel reels = (Reel) postingan;
                        System.out.println("played count : " + reels.getPlayedCount());
                    } else if (postingan instanceof Feed) {
                        Feed feeds = (Feed) postingan;
                        System.out.println("likes : " + feeds.getLikes());
                    } else if (postingan instanceof Story) {
                        Story stories = (Story) postingan;
                        System.out.println("views : " + stories.getViews());
                    }
                } else if (postingan.getContentState() == ContentState.ARCHIVED) {
                    if (postingan instanceof Reel) {
                        Reel reels = (Reel) postingan;
                        System.out.println("played count : " + reels.getPlayedCount());
                    } else if (postingan instanceof Feed) {
                        Feed feeds = (Feed) postingan;
                        System.out.println("likes : " + feeds.getLikes());
                    } else if (postingan instanceof Story) {
                        Story stories = (Story) postingan;
                        System.out.println("views : " + stories.getViews());
                    }
                } else if (postingan.getContentState() == ContentState.DELETED) {
                    int deletedPost = 0;
                    if (postingan instanceof Reel) {
                        deletedPost++;
                        System.out.println("deleted post" + deletedPost);
                    } else if (postingan instanceof Feed) {
                        deletedPost++;
                        System.out.println("deleted post" + deletedPost);
                    } else if (postingan instanceof Story) {
                        deletedPost++;
                       System.out.println("deleted post" + deletedPost);
                    }
                }
            }
        }
    }

    public static void showPost(String idPost) {
        ArrayList<User> listUser = new ArrayList<User>();
        ArrayList<Post> listPost = new ArrayList<Post>();
        dataDummy(listUser, listPost);

        for (int i = 0; i < listPost.size(); i++) {
            Post postingan = listPost.get(i);
            if (postingan.getPostId().equals(idPost)) {
                if (postingan instanceof Reel) {
                    Reel reels = (Reel) postingan;
                    System.out.println("Id post : " + reels.getPostId() + " \ndurasi : " + reels.getDuration() + " \nplayed count : " + reels.getPlayedCount());
                } else if (postingan instanceof Story) {
                    Story stories = (Story) postingan;
                    System.out.println("Id post : " + stories.getPostId() + " \ndurasi : " + stories.getDuration() + " \nviews : " + stories.getViews());
                } else if (postingan instanceof Feed) {
                    Feed feeds = (Feed) postingan;
                    System.out.println("Id post : " + feeds.getPostId() + " \ncaption : " + feeds.getCaption() + " \nlikes : " + feeds.getLikes());
                }
            }
        }
    }

    public static void changePostState(String userId) {
        ArrayList<User> listUser = new ArrayList<User>();
        ArrayList<Post> listPost = new ArrayList<Post>();
        dataDummy(listUser, listPost);

        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user.getUserID().equals(userId)) {
                for (int j = 0; j < user.post.size(); j++) {
                    Post postingan = listPost.get(j);
                    if (postingan instanceof Reel) {
                        Reel reels = (Reel) postingan;
                        if (reels.getContentState() == ContentState.SHOWED) {
                            System.out.println("sebelum diubah : " + reels.getContentState());
                            reels.setContentState(ContentState.ARCHIVED);
                            System.out.println("setelah diubah : " + reels.getContentState());
                        } else if (reels.getContentState() == ContentState.ARCHIVED) {
                            System.out.println("sebelum diubah : " + reels.getContentState());
                            reels.setContentState(ContentState.DELETED);
                            System.out.println("setelah : " + reels.getContentState());
                        }
                    } else if (postingan instanceof Story) {
                        Story stories = (Story) postingan;
                        if (stories.getContentState() == ContentState.SHOWED) {
                            System.out.println("sebelum diubah : " + stories.getContentState());
                            stories.setContentState(ContentState.ARCHIVED);
                            System.out.println("setelah diubah : " + stories.getContentState());
                        } else if (stories.getContentState() == ContentState.ARCHIVED) {
                            System.out.println("sebelum diubah : " + stories.getContentState());
                            stories.setContentState(ContentState.DELETED);
                            System.out.println("setelah diubah : " + stories.getContentState());
                        }
                    } else if (postingan instanceof Feed) {
                        Feed feeds = (Feed) postingan;
                        if (feeds.getContentState() == ContentState.SHOWED || feeds.getContentState() == ContentState.PINNED) {
                            System.out.println("sebelum diubah : " + feeds.getContentState());
                            feeds.setContentState(ContentState.ARCHIVED);
                            System.out.println("setelah diubah : " + feeds.getContentState());
                        } else if (feeds.getContentState() == ContentState.ARCHIVED) {
                            System.out.println("sebelum diubah : " + feeds.getContentState());
                            feeds.setContentState(ContentState.DELETED);
                            System.out.println("setelah diubah : " + feeds.getContentState());
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<User> listUser = new ArrayList<User>();
        ArrayList<Post> listPost = new ArrayList<Post>();
        dataDummy(listUser, listPost);

        showUserPosts();
        showPost("111");
        changePostState("001");
    }
}
