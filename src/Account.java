/*
    Todo: Name of Class
    Todo: Class Info
 */

import java.util.ArrayList;

public abstract class Account {
    private String name;
    private Image image;
    private ArrayList<Account> friends;
    private ArrayList<Moment> moments;

    public String getName () {
        return this.name;
    }

    public Image getImage () {
        return this.image;
    }

    public ArrayList<Moment> getMoments () {
        return this.moments;
    }

    public ArrayList<Account> getFriends() {
        return this.friends;
    }

    public void setFriends (ArrayList<Account> friends) {
        this.friends = friends;
    }

    public void setMoments (ArrayList<Moment> moments) {
        this.moments = moments;
    }

    public boolean equals (Object o) {
        return this.name.equals(o.getName());
    }

    public Account getFriendWithWhomIAmHappiest (){
        map<Account, float> friendMap;
        Account happiestFriend;

        for(Account a : this.friends){
            friendMap.push(a.getName(), 0);
        }

        for(Moment m : this.moments){
            for(Account par : m.getParticipants().keySet()){
                if(friendMap.containsKey(par)){
                    friendMap.put(par, friendMap.get(par) + m.getParticipants().get(par));
                }
            }
        }

        for(Account a : friendMap.keySet()){
            if(friendMap == null || friendMap.get(happiestFriend) < friendMap.get(a)){
                happiestFriend = a;
            }
        }

        return happiestFriend;
    }

    public Moment getOverallHappiestMoment (){
        Moment happiestMoment;

        for(Moment m : this.moments.values()){
            if(happiestMoment == null || happiestMoment.getParticipants.get(this) < m.getParticipants.get(this)){
                happiestMoment = m;
            }
        }

        return happiestMoment;
    }
}
