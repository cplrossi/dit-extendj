for file in $(find . -name '*.class'); do
	rm $file
done

echo '[ OK ] done cleanup'

exit 0

