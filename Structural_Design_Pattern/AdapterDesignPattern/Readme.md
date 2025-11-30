Adapter design pattern is used to make two different independent Interfaces compatible with each other.


Common use cases of adapter design pattern are:-
1. Legacy Code Integration

    Old class: LegacyPrinter.printText(String msg)
    
    New system needs: print(String message)
    
    Adapter calls legacy printer internally.

2. Third-Party API Integration

    Google Maps gives LatLng
    
    Your app needs Point(x, y)
    
    Adapter converts LatLng → Point.

3. Converting Incompatible Interfaces

    Client expects: playMp3(String file)
    
    Library provides: playSound(File file, String format)
    
    Adapter wraps the library method.

4. Standardizing Many Different Interfaces

    Module A uses: send()
    
    Module B uses: transmit()
    
    Module C uses: dispatch()

Adapters make them all behave like send().

5. Reusing Existing Classes

    Existing logger: writeLog(String s)
    
    New code expects: log(String message)

Adapter maps method → reusable without rewriting.
