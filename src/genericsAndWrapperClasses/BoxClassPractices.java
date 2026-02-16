package genericsAndWrapperClasses;

public class BoxClassPractices<T> {
    T value;

            void store(T value) {
                this.value = value;

            }

            T bring() {
                return value;
            }
        }

