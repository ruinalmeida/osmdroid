package org.andnav.osm.tileprovider;

public interface IOpenStreetMapTileProviderCloudmadeTokenCallback {

	/**
	 * Get the token for Cloudmade tiles. See
	 * http://developers.cloudmade.com/projects/show/auth
	 * 
	 * @return
	 * @throws CloudmadeException
	 */
	String getCloudmadeToken(String key) throws CloudmadeException;

	/**
	 * Get the API key for Cloudmade tiles. See
	 * http://developers.cloudmade.com/projects/show/auth
	 * 
	 * @throws CloudmadeException
	 *             if the key is not found
	 * @return
	 */
	String getCloudmadeKey() throws CloudmadeException;
}
