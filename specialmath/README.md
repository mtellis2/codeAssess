# SpecialMath

This utility is a conversion of specialMath.py to Scala. `$> specialMath 90` returns `19740274219868223074`.

# Usage Steps

You can run using the supplied jar file and the command below:

```
scala project/specialMath.jar INPUT_INT
```

The jar file was created using `sbt package`.

You can also run using sbt:

```
sbt "run INPUT_INT"
```

# Testing

```
sbt test
```
