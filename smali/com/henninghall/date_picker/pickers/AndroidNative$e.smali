.class Lcom/henninghall/date_picker/pickers/AndroidNative$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/henninghall/date_picker/pickers/AndroidNative;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/henninghall/date_picker/pickers/AndroidNative;


# direct methods
.method constructor <init>(Lcom/henninghall/date_picker/pickers/AndroidNative;)V
    .locals 0

    iput-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$e;->k:Lcom/henninghall/date_picker/pickers/AndroidNative;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$e;->k:Lcom/henninghall/date_picker/pickers/AndroidNative;

    invoke-static {v0}, Lcom/henninghall/date_picker/pickers/AndroidNative;->k(Lcom/henninghall/date_picker/pickers/AndroidNative;)Lcom/henninghall/date_picker/pickers/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/henninghall/date_picker/pickers/a$a;->a()V

    return-void
.end method
