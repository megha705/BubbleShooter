�PNG

   IHDR   0   0   �1  IDATX��YlTe��w�̝nL)�l�Ų$bE$DMH|�E}�L}0&|�D�K 1c�0�M�
��t��t:s�w|�@3S$��{��������ρ{v������n�7P[E���Q�'�uD�wA�*�qJ�;
`D%�H�ٕ���ʲ�tbn�dn��(��j_6���iζ zS�o��I�:��GSs���_6�	%��?uU1������%!ڡuWY��HA#t�خ�es��lk����t�8����}$�L��x�{k	�����u�gvf����*$TC�O5�
"V;�\����l��N�������� �:q]n�0f�_�b�wT��t��!�s��i����q5(`�������^�������Q ����lj��Gb�-JSA���fED�X� ��v�XAT��|Y_֖8<��m*�!9CC3�N������^��5#���"�X��/U~0K�/Z�bMI��г�ꁭ#7�Z+=��ﷃ*F©3��%��S��Egu��#Sv�L!�%7i��m]Y��`�Ʊo�4��[�M��(B��h���5�o��B=�,lK}ï%  "�W��>�X��*rZ�u�w�^���R���g�s�l�k�V����u�#������m�a�~ํ�Z��~�����ޝ�`���
o �Ǘ9���	�ݲ���8w�z�NOjzG4]�;R�v��0=�G	&��/i9Q�Y�>f,"Ze���i.`J ���;�ͱ���F�( kj�8'�����G��1���3�FM����mX���l��B�Z �ʴ�Q�c��,~n)��
ȁ\� ��WUȨ'C�b��ZJ��3�ʁB�X���d�b��D|��d9oIf�)�M�:#��T3���ZUh��>�����Z��7:�誩�^�a��Ծ�ꎒM��3:un.���H�sl��8�>���y�|��bp�g���@`E۴��u��X}l~tud�q�bp�k��r�Ѣ ������f.���:j�L*	(�V�J��Z1�z�}9��kO�B��C�R�!����WH	F�P].���Ǜ+�<4bK�<���Wv � �:�ٗ������]q5ðR�(8�R�^�� ��};��K����i��#z`��K�+E���<�h��1�}_c����u�&H����E�X<���)ݜJ�Y�����6�2}a/i��.:���dAI)�df�Q !O�,�H'��{���GF��U �>)�C.
2x��Z2��<���[߳{v'�_"�A�P�    IEND�B`�                                                                                                                                                                                  ////////////////
						startActivity(intent);
						//splash.ourSong.pause();
			}
		});

		options.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				soundAfterPause=false;
				Intent intent=new Intent("android.intent.action.PREFRENCES");///////////////////////////////
				startActivity(intent);
				
			}
		});
		
		help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				soundAfterPause=true;
				Intent intent=new Intent("android.intent.action.HELP");///////////////////////////////
				startActivity(intent);
			}
		});
		
		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				soundAfterPause=true;
				Intent intent=new Intent("android.intent.action.ABOUT");///////////////////////////////
				startActivity(intent);
			}	
		});

	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 SharedPreferences getData = PreferenceManager
				    .getDefaultSharedPreferences(getBaseContext());
				  splash.globalSound=getData.getBoolean("sound_control", true);
		soundAfterPause=false;
		if(!splash.ourSong.isPlaying() &&splash.globalSound==true)
		splash.ourSong.start();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(soundAfterPause==false)splash.ourSong.pause();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		splash.ourSong.release();
	}
	
	
}


