class Counter {
    public static $count = 0;

    public static function increment() {
        self::$count++;
    }

    public static function getCount() {
        return self::$count;
    }
}

// Increment the counter
Counter::increment();
Counter::increment();

// Get the count
echo Counter::getCount(); // Output: 2
