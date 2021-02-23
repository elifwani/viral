void setup() 
{}


/* find out if the post is going to go viral */
void draw() 
{
    engagement(); // call the engagement method

    if(trending() == postTopic() && ef > 1) // conditions that need to be met for a post to go viral
    {
        println("You are going viral!"); // conditions are met
    } else {
        println("You are not going viral."); // conditions are not met
    }
}


/* engagement factor calculated */
int engagement() 
{
    int ef = 0;
    int sumInt = avgLikes(int number) + avgComments(int number) + avgShares(int number); // sum of all interactions on the page 

    ef = sumInt/followerCount(int number); // engagement factor, if > 1, possibly trending

    return ef;
}


/* ask user to input the number of followers */
int followerCount(int number)
{
    // ask the user to enter the number of followers
    println("Enter number of followers: ");
    // reads the integer
    int number = nextInt();
    // the method returns the number of followers
    
    return number;
}


/* find out what is trending*/
String trending() 
{
    // check the trending page for popular topics

    String trending = (/*trending topics*/);

    return trending;
}

/* find out what the topic of the post is */
String postTopic() 
{
    // look for key objects in the video/photo that might suggest which topic it fits under
    // listen for key words that might suggest which topic it fits under
    
    String topics = (/*suggested topics*/);

    return topics;
}


/* average number of likes received in the last i posts */
int avgLikes(int number) 
{
    int likes = 0;

    for (int i = 0; i < number.length; i++) {
            likes += number[i]; // calculate the total likes from i posts
    }

    int avgLikes = likes/i; //calculate the average number of likes in i posts

    return avgLikes;
}


/* average number of comments received in the last i posts */
int numComments(int number) 
{
    int comments = 0;

    for (int i = 0; i < number.length; i++) {
            comments += number[i]; // calculate the total comments from i posts
    }
    
    int avgComments = comments/i; //calculate the average number of comments in i posts

    return avgComments;
}


/* average number of shares received in the last i posts */
int numShares(int number) 
{
    int shares = 0;

    for (int i = 0; i < number.length; i++) {
        shares += number[i]; // calculate the total shares from i posts
    }

    int avgShares = shares/i; //calculate the average number of shares in i posts

    return avgShares;
}