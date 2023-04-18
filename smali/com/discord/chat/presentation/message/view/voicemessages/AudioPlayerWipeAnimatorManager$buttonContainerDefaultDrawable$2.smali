.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;-><init>(Landroid/content/Context;Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/drawable/Drawable;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2;->$context:Landroid/content/Context;

    .line 3
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    instance-of v1, v1, Lcom/discord/theme/LightTheme;

    if-eqz v1, :cond_0

    .line 4
    sget v1, Lcom/discord/chat/R$drawable;->drawable_audio_play_button_gradient_light:I

    goto :goto_0

    .line 5
    :cond_0
    sget v1, Lcom/discord/chat/R$drawable;->drawable_audio_play_button_gradient_dark:I

    .line 6
    :goto_0
    invoke-static {v0, v1}, Le/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2;->invoke()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
