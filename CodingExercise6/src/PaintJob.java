public class PaintJob {

    public static void main(String[] args) {

        //Test cases
        System.out.println("Width: -3.4 Height: 2.1 Area per Bucket:1.5 Extra Bucket: 2 needs " +
                getBucketCount(-3.4, 2.1, 1.5, 2) + " buckets");
        System.out.println("Width: 3.4 Height: 2.1 Area per Bucket:1.5 Extra Bucket: 2 needs " +
                getBucketCount(3.4, 2.1, 1.5, 2) + " buckets");
        System.out.println("Width: 2.75 Height: 3.25 Area per Bucket:2.5 Extra Bucket: 1 needs " +
                getBucketCount(2.75, 3.25, 2.5, 1) + " buckets");

        System.out.println("Width: 3.4 Height: 2.1 Area per Bucket:1.5 " +
                getBucketCount(-3.4, 2.1, 1.5) + " buckets");
        System.out.println("Width: 3.4 Height: 2.1 Area per Bucket:1.5 " +
                getBucketCount(3.4, 2.1, 1.5) + " buckets");
        System.out.println("Width: 7.25 Height: 4.3 Area per Bucket:2.35 " +
                getBucketCount(7.25, 4.3, 2.35) + " buckets");

        System.out.println("Area: 3.4 Area per Bucket:1.5 " +
                getBucketCount(3.4,1.5) + " buckets");
        System.out.println("Area: 6.26 Area per Bucket:2.2 " +
                getBucketCount(6.26,2.2) + " buckets");
        System.out.println("Area: 3.26 Area per Bucket:0.75 " +
                getBucketCount(3.26,0.75) + " buckets");
    }

    //Bob is a wall painter and he needs your help. You have to write a program that helps
    // Bob calculate how many buckets of paint he needs to buy before going to work.
    // Bob might also have some extra buckets at home.
    // He also knows the area that he can cover with one bucket of paint.
    //
    //1. Write a method named getBucketCount with 4 parameters.
    // The first parameter should be named width of type double.
    // This parameter represents the width of the wall.
    //
    //The second parameter should be named height of type double.
    // This parameter represents the height of the wall.
    //
    //The third parameter should be named areaPerBucket.
    // This parameter represents the area that can be covered with one bucket of paint.
    //
    //The fourth parameter should be named extraBuckets.
    // This parameter represents the bucket count that Bob has at home.
    //
    //The method needs to return a value of type int that represents the number of buckets that
    // Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
    //
    //If one of the parameters width, height or areaPerBucket is less or equal to 0 or
    // if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
    //
    //If all parameters are valid, the method needs to calculate the number of buckets and return it.
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        //If one of the parameters width, height or areaPerBucket is less or equal to 0 or
        // if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        //Calculate the area to paint
        double area = width * height;
        //Calculate how many buckets are needed
        int buckets = (int)Math.ceil(area / areaPerBucket);

        //Calculate how many buckets are needed to buy
        return buckets - extraBuckets;

    }

    //2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
    //
    //Write another overloaded method named getBucketCount with 3 parameters namely width, height,
    // and areaPerBucket (all of type double).
    //
    //This method needs to return a value of type int that represents the number of buckets that
    // Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
    //
    //If one of the parameters width, height or areaPerBucket is less or equal to 0,
    // the method needs to return -1 to indicate an invalid value.
    //
    //If all parameters are valid, the method needs to calculate the number of buckets and return it.
    public static int getBucketCount(double width, double height, double areaPerBucket) {

        //If one of the parameters width, height or areaPerBucket is less or equal to 0,
        // the method needs to return -1 to indicate an invalid value.
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        //Calculate the area to paint
        double area = width * height;
        //Calculate how many buckets are needed
        int buckets = (int)Math.ceil(area / areaPerBucket);

        return buckets;
    }

    //3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall.
    // He needs you to write another method.
    //
    //Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket
    // (both of type double).
    //
    //The method needs to return a value of type int that represents the number of buckets that Bob needs to
    // buy before going to work. To calculate the bucket count, refer to the notes below.
    //
    //If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1
    // to indicate an invalid value.
    //
    //If all parameters are valid, the method needs to calculate the number of buckets and return it.
    public static int getBucketCount(double area, double areaPerBucket) {

        //If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1
        // to indicate an invalid value.
        if((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        //Calculate how many buckets are needed
        int buckets = (int)Math.ceil(area / areaPerBucket);

        return buckets;
    }
}
