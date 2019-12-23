#! groovy
import codes.showme.pipeline.lib.Persion

def call(Persion persion) {
    echo "me me me !!! ${persion.name} ${persion.age}"
}