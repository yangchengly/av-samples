<html>
<body>
	<h2>Hello World!</h2>
	<script>
		function openUpload_() {
			openUpload(null, 'JPG,GIF,JPEG,PNG', '5', callback);
		}

		/**  
		 * 回调函数,获取上传文件信息  
		 * realName真实文件名  
		 * saveName文件保存名  
		 * maxSize文件实际大小  
		 */
		function callback(realName, saveName, maxSize) {
			$("#photo_").val(saveName);
			//回调后其它操作  
		}
	</script>

	<tr>
		<td>头像：</td>
		<td><input type="hidden" name="photo" id="photo_"></input> <input
			type="button" onclick="openUpload_()" value="上传" /></td>
	</tr>

</body>
</html>
