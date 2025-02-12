import java.util.ArrayList;
import java.util.List;

class LinkedList {
    private Node head;

    private class Node {
        int id;
        String username;
        int userAge;
        List<Integer> friendList;
        User nextUser;

        public Node(int id, String username, int userAge) {
            this.id = id;
            this.username = username;
            this.userAge = userAge;
            this.friendList = new ArrayList<>();
            this.nextUser = null;
        }

        public void addFriend(int friendId) {
            if (!friendList.contains(friendId)) {
                friendList.add(friendId);
            }
        }

        public void removeFriend(int friendId) {
            friendList.remove(Integer.valueOf(friendId));
        }

        public void showFriends() {
            System.out.println(username + "'s Friends: " + friendList);
        }
    }

    public void registerUser(int id, String name, int age) {
        Node newUser = new Node(id, name, age);
        if (head == null) {
            head = newUser;
        } else {
            Node temp = head;
            while (temp.nextUser != null) {
                temp = temp.nextUser;
            }
            temp.nextUser = newUser;
        }
        System.out.println("User " + name + " registered successfully.");
    }

    private Node getUser(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.nextUser;
        }
        return null;
    }

    public void Friendship(int id1, int id2) {
        Node user1 = getUser(id1);
        Node user2 = getUser(id2);

        if (user1 != null && user2 != null) {
            user1.addFriend(id2);
            user2.addFriend(id1);
            System.out.println("Friendship established between " + user1.username + " and " + user2.username);
        } else {
            System.out.println("Error: One or both users do not exist.");
        }
    }

    public void terminate(int id1, int id2) {
        Node user1 = getUser(id1);
        Node user2 = getUser(id2);

        if (user1 != null && user2 != null) {
            user1.removeFriend(id2);
            user2.removeFriend(id1);
            System.out.println("Friendship removed between " + user1.username + " and " + user2.username);
        } else {
            System.out.println("Error: One or both users do not exist.");
        }
    }

    public void displayUserFriends(int id) {
        Node user = getUser(id);
        if (user != null) {
            user.showFriends();
        } else {
            System.out.println("User not found.");
        }
    }

    public void findCommonFriends(int id1, int id2) {
        Node user1 = getUser(id1);
        Node user2 = getUser(id2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>();
            for (int friendId : user1.friendList) {
                if (user2.friendList.contains(friendId)) {
                    mutualFriends.add(friendId);
                }
            }
            System.out.println("Mutual friends of " + user1.username + " and " + user2.username + ": " + mutualFriends);
        } else {
            System.out.println("Error: One or both users do not exist.");
        }
    }

    public void ByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.username.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.username + " (ID: " + temp.id + ", Age: " + temp.userAge + ")");
                return;
            }
            temp = temp.nextUser;
        }
        System.out.println("User not found.");
    }

    public void showCount(int id) {
        Node user = getUser(id);
        if (user != null) {
            System.out.println(user.username + " has " + user.friendList.size() + " friends.");
        } else {
            System.out.println("User not found.");
        }
    }
}

public class SocialMedia {
    public static void main(String[] args) {
        LinkedList network = new LinkedList();

        network.registerUser(1, "Rahul Sharma", 26);
        network.registerUser(2, "Meera Singh", 24);
        network.registerUser(3, "Ankit Patel", 28);

        network.Friendship(1, 2);
        network.Friendship(1, 3);
        network.displayUserFriends(1);

        network.findCommonFriends(2, 3);
        network.ByName("Meera Singh");
        network.showCount(1);

        network.terminate(1, 3);
        network.displayUserFriends(1);
    }
}