# Kotlin Import Object Fails with Android library

This project will not build due to a compiler error. An object imported in the main app from the 
 library does not work *if* code coverage is enabled.
 
If you remove `testCoverageEnabled true` from `library/build.gradle`, the build will succeed.

Something in JaCoCo instrumentation is mangling the Kotlin symbols.

