package vn.name.minhtrung.appbanhang.retrofit;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import vn.name.minhtrung.appbanhang.model.NotiResponse;
import vn.name.minhtrung.appbanhang.model.NotiSendData;

public interface APIPushNotification {
    @Headers(
            {
                    "Content-Type: application/json",
                    "Authorization: key=AAAAZwevp44:APA91bG2X9bK06IEbn6D7TmIgvS6UttvjNZ2PhdMxMhN8-Re0DzY7TWWESrLozgftchCl_38ekWIBjmfXZqumhGMoym3T3tCCdj5W7_bBsc6XTt7hkyoJnM9bqj4p0QlNJsZFrwVexgL"
            }
    )
    @POST("fcm/send")
    Observable<NotiResponse> sendNotification(@Body NotiSendData data);
}
