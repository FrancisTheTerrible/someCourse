package Section_5;
/*
1. Write a method named getBucketCount with parameters width (double), height(double), areaPerBucket(double), extraBuckets(int).
If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.

2. Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).
This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.

3. Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.

NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it into an int before returning the value from the methods.

Origin: Java course by Tim Buchalka
 */
public class PaintJob {
    static public int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        // If any of parameters is <= 0 return -1
        if( width <= 0 || height <= 0 || areaPerBucket <=0 || extraBucket < 0 ){
            return -1;            
        }
        double numberOfBuckets = (( width * height ) / areaPerBucket );
        System.out.println("numberOfBuckets : " + numberOfBuckets);
        //round the number to the next smallest integer as requested
        int roundNumberOfBuckets = ( int )(Math.ceil( numberOfBuckets ));
        System.out.println("numberOfBuckets after rounding: " + roundNumberOfBuckets);
        //  substract extraBuckets from result
        int bucketCount = roundNumberOfBuckets - extraBucket;

        return bucketCount;
    }
    static public int getBucketCount( double width, double height, double areaPerBucket ){
        // If any of parameters is <= 0 return -1
        if( width <= 0 || height <= 0 || areaPerBucket <=0 ){
            return -1;
        }
        double numberOfBuckets = (( width * height ) / areaPerBucket );
        System.out.println("numberOfBuckets : " + numberOfBuckets);
        //round the number to the next smallest integer as requested
        int roundNumberOfBuckets = ( int )(Math.ceil( numberOfBuckets ));
        System.out.println("numberOfBuckets after rounding: " + roundNumberOfBuckets);
        int bucketCount = roundNumberOfBuckets;

        return bucketCount;
    }
    static public int getBucketCount( double area, double areaPerBucket ){
        // If any of parameters is <= 0 return -1
        if( area <= 0 || areaPerBucket <=0 ){
            return -1;
        }
        double numberOfBuckets = (( area ) / areaPerBucket );
        //round the number to the next smallest integer as requested
        int roundNumberOfBuckets = (int)(Math.ceil( numberOfBuckets ));
        //  return must be integer

        int bucketCount = roundNumberOfBuckets;

        return bucketCount;
    }
}
